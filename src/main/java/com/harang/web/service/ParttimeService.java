package com.harang.web.service;

import java.util.HashMap;
import java.util.List;

import com.harang.web.domain.D_ApplyDTO;
import com.harang.web.domain.DaetaDTO;
import com.harang.web.domain.DaetaReplyDTO;
import com.harang.web.domain.MemberDTO;
import com.harang.web.domain.P_ApplyDTO;
import com.harang.web.domain.ParttimeDTO;
import com.harang.web.domain.ParttimeReplyDTO;
import com.harang.web.domain.SearchCriteria;

public interface ParttimeService {
	public List<ParttimeDTO> getParttimeList(SearchCriteria cri);
	public List<ParttimeDTO> getMyParttimeList(HashMap<String, Object> params);
	public List<DaetaDTO> getDaetaList(SearchCriteria cri);
	public List<DaetaDTO> getMyDaetaList(HashMap<String, Object> params);
	public int getParttimeCnt_apply(String p_num);
	public int getDaetaCnt_apply(String d_num);
	public ParttimeDTO getParttime(String p_num);
	public DaetaDTO getDaeta(String d_num);
	public void counterUp_Parttime(String p_num);
	public void counterUp_Daeta(String d_num);
	public MemberDTO getMember(String m_id);
	public void createParttimeResume(P_ApplyDTO p_apply);
	public void createDaetaResume(D_ApplyDTO d_apply);
	public void deleteParttime(String p_num);
	public void deleteDaeta(String d_num);
	public void deleteParttimeApply(String p_num);
	public void deleteDaetaApply(String d_num);
	public List<P_ApplyDTO> getParttimeApplyList(String p_num);
	public List<D_ApplyDTO> getDaetaApplyList(String d_num);
	public List<P_ApplyDTO> getMyParttimeApplyList(HashMap<String, Object> params);
	public List<D_ApplyDTO> getMyDaetaApplyList(HashMap<String, Object> params);
	public List<P_ApplyDTO> getParttimeApply(HashMap<String, Object> params);
	public List<D_ApplyDTO> getDaetaApply(HashMap<String, Object> params);
	public void updateParttimeChoice(HashMap<String, Object> params);
	public void updateDaetaChoice(HashMap<String, Object> params);
	public void deleteParttimeApply(HashMap<String, Object> params);
	public void deleteDaetaApply(HashMap<String, Object> params);
	public void insertParttime(ParttimeDTO parttime);
	public void insertDaeta(DaetaDTO daeta);
	public void updateParttime(ParttimeDTO parttime);
	public void updateDaeta(DaetaDTO daeta);
	public List<String> getPicked(String d_num);
	public void updateDaetaMember(D_ApplyDTO d_apply);
	public void report(D_ApplyDTO d_apply);
	public List<ParttimeReplyDTO> getParttimeReplyList(String p_num);
	public List<DaetaReplyDTO> getDaetaReplyList(String d_num);
	public void insertParttimeReply(ParttimeReplyDTO p_reply);
	public void insertDaetaReply(DaetaReplyDTO d_reply);
	public void deleteParttimeReply(String pr_num);
	public void deleteDaetaReply(String dr_num);
}
