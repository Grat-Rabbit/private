package cn.onlineexam.exam.service;

import java.sql.SQLException;
import java.util.List;

import cn.onlineexam.exam.domain.Score;
import cn.onlineexam.question.domain.Cloze;
import cn.onlineexam.question.domain.Judge;
import cn.onlineexam.question.domain.Program;
import cn.onlineexam.question.domain.QuestionSelect;
import cn.onlineexam.exam.dao.ExamDao;

public class ExamService { 
	private ExamDao examDao=new ExamDao();

	public List<QuestionSelect> selectExam(String selectString) throws SQLException {
		return examDao.selectExam(selectString);
	}

	public List<Judge> judgeExam(String judgeString) throws SQLException {
		return examDao.judgeExam(judgeString);
	}

	public List<Cloze> clozeExam(String clozeString) throws SQLException {
		
		return examDao.clozeExam(clozeString);
	}

	public String getSelect() throws SQLException {
		return examDao.getSelect();
	}
	public String getJudge() throws SQLException {
		return examDao.getJudge();
	}
	public String getCloze() throws SQLException {
		return examDao.getCloze();
	}
	
	
	
	public int selectCount(List<String> selects,String selectString) throws SQLException {
		return examDao.selectCount(selects,selectString);
	}
	public int judgeCount(List<String> judges,String judgeString) throws SQLException {
		return examDao.judgeCount(judges,judgeString);
	}
	public int clozeCount(List<String> clozes,String clozeString) throws SQLException {	
		return examDao.clozeCount(clozes,clozeString);
	}

	public String getProgram() throws SQLException {
		return examDao.getProgram();
	}

	public List<Program> programExam(String programString) throws SQLException {
		return examDao.programExam(programString);
	}

	public Score findStudent(String studentName) throws SQLException {
		return examDao.findStudent(studentName);
	}

	public void addProgramSubmit(String loginname, String question, String program) throws SQLException {
		examDao.addProgramSubmit(loginname,question,program);
		
	}

	public void addScore(String loginname, int score, int selectCount, int judgeCount,int clozeCount) throws SQLException {
		examDao.addScore(loginname,score,selectCount,judgeCount,clozeCount);
		
	}


}
