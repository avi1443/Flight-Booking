package com.pack.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pack.model.Cancellation;

@Repository
@Transactional
public class cancellationDao extends JdbcDaoSupport {

	@Autowired
	public cancellationDao(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public boolean addCancellation(Cancellation stud) {
		System.out.println("info: inside addCancellation method in cancellationDao");
		String sql1 = "INSERT INTO Cancellation(passenger_id,cancellation_id,cancellation_Date,flight_code,ticket_id) VALUES(?,?,?,?,?)";
		Object[] params = new Object[] { stud.getPassenger_id(), stud.getCancellation_id(), stud.getCancellation_Date(),
				stud.getFlight_code(), stud.getTicket_id() };
		this.getJdbcTemplate().update(sql1, params);
		return true;
	}

	public List<Cancellation> showStud() {
		System.out.println("info: inside showStud method in cancellationDao");
		String sql = "select * from cancellation ";

		List<Cancellation> studlist = this.getJdbcTemplate().query(sql,
				BeanPropertyRowMapper.newInstance(Cancellation.class));
		System.out.println(studlist);
		return studlist;
	}

	public boolean deleteCancellation(Integer passenger_id) {
		System.out.println("info: inside deleteCancellation method in cancellationDao");
		String sql = "delete from cancellation where passenger_id=?";
		Object[] params = new Object[] { passenger_id };
		this.getJdbcTemplate().update(sql, params);
		return true;
	}

	public Cancellation editStud(Integer passenger_id) {
		System.out.println("info: inside editStud method in cancellationDao");
		String sql = "select * from cancellation where passenger_id=?";
		Object[] param = new Object[] { passenger_id };
		Cancellation stud = this.getJdbcTemplate().queryForObject(sql, param, new BeanPropertyRowMapper<Cancellation>(Cancellation.class));
		return stud;
	}

	public boolean updateStud(Cancellation stud) {
		System.out.println("info: inside updateStud method in cancellationDao");
		String sql1 = "update cancellation s set s.cancellation_id=?,s.cancellation_Date=?,s.flight_code=?,s.ticket_id=? where s.passenger_id=?";
		Object[] params = new Object[] { stud.getCancellation_id(), stud.getCancellation_Date(), stud.getFlight_code(),
				stud.getFlight_code(), stud.getPassenger_id() };
		this.getJdbcTemplate().update(sql1, params);
		return true;
	}

}
