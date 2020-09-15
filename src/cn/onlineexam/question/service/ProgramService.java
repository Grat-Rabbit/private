package cn.onlineexam.question.service;

import java.sql.SQLException;

import cn.onlineexam.question.dao.ProgramDao;
import cn.onlineexam.question.domain.Program;
import cn.onlineexam.student.domain.PageBean;

public class ProgramService {
	private ProgramDao programDao=new ProgramDao();

	public PageBean<Program> findAll(int page, int rows) throws SQLException {
		return programDao.findAll(page,rows);
	}

	public boolean add(Program program) throws SQLException {
		return programDao.add(program);
	}

	public boolean removeProgram(String idString) throws SQLException {
		return programDao.removeProgram(idString);
	}

}
