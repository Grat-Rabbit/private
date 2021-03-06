package cn.onlineexam.question.service;

import java.sql.SQLException;

import cn.onlineexam.question.dao.SelectChangeDao;
import cn.onlineexam.question.domain.Cloze;
import cn.onlineexam.question.domain.Judge;
import cn.onlineexam.question.domain.Program;
import cn.onlineexam.question.domain.QuestionSelect;
import cn.onlineexam.student.domain.PageBean;

public class SelectChangeService {
	private SelectChangeDao selectChangeDao=new SelectChangeDao();

	public PageBean<Program> find(String chapter) throws SQLException {
		return selectChangeDao.find(chapter);
	}

	public PageBean<Program> findFromScore(String grade) {
		return selectChangeDao.findFromScore(grade);
	}

	public PageBean<Cloze> findFromClozeChapter(String chapter) {
		return selectChangeDao.findFromClozeChapter(chapter);
	}

	public PageBean<Cloze> findFromClozeGrade(String grade) {
		return selectChangeDao.findFromClozeGrade(grade);
	}

	public PageBean<QuestionSelect> changeFromSelectChapter(String chapter) {
		return selectChangeDao.changeFromSelectChapter(chapter);
	}



	public PageBean<Judge> changeFromJudgeChapter(String chapter) {
		return selectChangeDao.changeFromJudgeChapter(chapter);
	}

	public PageBean<Judge> changeFromJudgeGrade(String grade) {
		return selectChangeDao.changeFromJudgeGrade(grade);
	}

	public PageBean<QuestionSelect> changeFromSelectGrade(String grade) {
		return selectChangeDao.changeFromSelectGrade(grade);
	}

}
