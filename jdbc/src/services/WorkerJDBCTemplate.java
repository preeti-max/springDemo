package services;



import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import dao.WorkerDAO;
import mappers.WorkerMapper;
import model.Worker;

public class WorkerJDBCTemplate implements WorkerDAO {
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void create(int worker_id, String first_name, String last_name, int salary, Date joining_date, String department,
            String email) {
		String query = """
                INSERT INTO Worker (
                    WORKER_ID,
                    FIRST_NAME,
                    LAST_NAME,
                    SALARY,
                    JOINING_DATE,
                    DEPARTMENT,
                    email)
                VALUES
                (?,?,?,?,?,?,? )""";
		
		
		jdbcTemplateObject.update(query, worker_id,first_name,last_name,salary,joining_date,department,email);
		
		System.out.println("Student " + first_name + " "+last_name+"'s record inserted successfully");
		return;
	}
	
	public Worker getWorkerById(Integer worker_id) {
		String sql = "SELECT * FROM worker WHERE worker_id = ?";
		Worker worker = jdbcTemplateObject.queryForObject(
				sql, 
				new Object[] {worker_id}, 
				new WorkerMapper()
				);
		
		return worker;
	}
	
	public List<Worker> getAllWorkers() {
		String sql = "SELECT * FROM worker";
		List<Worker> workers = jdbcTemplateObject.query(
				sql, 
				new WorkerMapper()
				);
		
		return workers;
	}
	
	public void update(Worker w) {
		 String query = "Update worker Set worker_id =?,first_name=?,last_name=?,salary=?,joining_date=?,department=?,email=? where worker_id=?";
		
		jdbcTemplateObject.update(query,w.getWorker_id(), w.getFirst_name(),w.getLast_name(),w.getSalary(),w.getJoining_date(),w.getDepartment(),w.getEmail(),w.getWorker_id());
		System.out.println("Record #" + w.getWorker_id() + "updated");
		return;
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM worker WHERE worker_id = ?";
		jdbcTemplateObject.update(sql, id);
		System.out.println("Record #" + id + " deleted");
		return;
	}

	
}