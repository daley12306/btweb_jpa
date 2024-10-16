package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.entity.Video;

public interface IVideoDao {

	int count();

	List<Video> findAll(int page, int pagesize);

	List<Video> findByVideoname(String catname);

	List<Video> findAll();

	Video findById(int cateid);

	void delete(int cateid) throws Exception;

	void update(Video video);

	void insert(Video video);

}
