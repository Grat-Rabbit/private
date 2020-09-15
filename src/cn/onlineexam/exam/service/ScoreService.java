package cn.onlineexam.exam.service;

import java.sql.SQLException;

import cn.onlineexam.exam.domain.Score;
import cn.onlineexam.student.domain.PageBean;
import cn.onlineexam.exam.dao.ScoreDao;

public class ScoreService {
	ScoreDao scoreDao=new ScoreDao();
	public PageBean<Score> findAll(int page , int rows) throws SQLException {
		return scoreDao.findAll(page,rows);

	}
	public boolean add(String id, String studentName, String score) throws SQLException {
		return scoreDao.add(id, studentName, score);

	}
	public boolean removeScore(String uidString) throws SQLException {
		return scoreDao.removeScore(uidString);

	}
	public boolean belowToSixty() throws SQLException {
		return scoreDao.belowToSixty();
	}
	public PageBean<Score> findAll(int page, int rows, String changeString) throws SQLException {
		return scoreDao.findAll(page,rows,changeString);
	}
	public PageBean<Score> findById(int page, int rows, int id) throws SQLException {
		return scoreDao.findById(page,rows,id);
	}

}
