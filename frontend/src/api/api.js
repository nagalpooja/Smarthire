import axios from 'axios';

const API_BASE = 'http://localhost:8080';

export const fetchJobs = () => axios.get(`${API_BASE}/job-posts`);

//export const searchJobs = (text) => axios.get(`${API_BASE}/job-posts/${text}`);
export const searchJobs = (text) => axios.get(`${API_BASE}/job-posts/search/${text}`);

export const createJobPost = (job) => axios.post(`${API_BASE}/create-job-post`, job);
export const deleteJob = (id) => {
  return axios.delete(`http://localhost:8080/delete-job-post/${id}`);
};