package cn.onlineexam.question.service;

import java.sql.SQLException;

import cn.onlineexam.question.dao.QuestionSelectDao;
import cn.onlineexam.question.domain.QuestionSelect;
import cn.onlineexam.student.domain.PageBean;

public class QuestionSelectService {
	private QuestionSelectDao questionSelectDao=new QuestionSelectDao();
	public PageBean<QuestionSelect> findAll(int page ,int rows) throws SQLException {
		return questionSelectDao.findAll(page,rows);

	}
	public boolean add(QuestionSelect questionSelect) throws SQLException {
		return questionSelectDao.add(questionSelect);

	}
	public boolean removeSelect(String idString) throws SQLException {
		return questionSelectDao.removeStudent(idString);

	}
	public PageBean<QuestionSelect> findById(int page, int rows, int id) throws SQLException {
		return questionSelectDao.findById(page,rows,id);
	}

}
