package com.crm.pojo;

public class Customer {
	private String customer_no;//�ͻ����
	private String customer_name;//�ͻ�����
	private String customer_academic;//ѧ��
	private String customer_region;//��������
	private String customer_post;//��������
	private String customer_address;//��ַ
	private String customer_phone;//�绰
	private String customer_source;//��Դ����
	private String customer_create_time;//����ʱ��
	private String customer_qq;//
	private String customer_course;//�γ̷���
	private String customer_onevisit_time;//�״λط�ʱ��
	private String customer_ingate_time;//����ʱ��
	private Integer customer_id;//����
	private Integer customer_age;//����
	private Integer customer_sex;//�Ա�
	private Integer customer_level;//�ȼ�
	private Integer customer_status;//״̬
	private Integer customer_visit;//�Ƿ����
	private Integer customer_ingate;//�Ƿ�����
	private Integer user_id;//�û����
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_academic() {
		return customer_academic;
	}
	public void setCustomer_academic(String customer_academic) {
		this.customer_academic = customer_academic;
	}
	public String getCustomer_region() {
		return customer_region;
	}
	public void setCustomer_region(String customer_region) {
		this.customer_region = customer_region;
	}
	public String getCustomer_post() {
		return customer_post;
	}
	public void setCustomer_post(String customer_post) {
		this.customer_post = customer_post;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getCustomer_source() {
		return customer_source;
	}
	public void setCustomer_source(String customer_source) {
		this.customer_source = customer_source;
	}
	public String getCustomer_create_time() {
		return customer_create_time;
	}
	public void setCustomer_create_time(String customer_create_time) {
		this.customer_create_time = customer_create_time;
	}
	public String getCustomer_qq() {
		return customer_qq;
	}
	public void setCustomer_qq(String customer_qq) {
		this.customer_qq = customer_qq;
	}
	public String getCustomer_course() {
		return customer_course;
	}
	public void setCustomer_course(String customer_course) {
		this.customer_course = customer_course;
	}
	public String getCustomer_onevisit_time() {
		return customer_onevisit_time;
	}
	public void setCustomer_onevisit_time(String customer_onevisit_time) {
		this.customer_onevisit_time = customer_onevisit_time;
	}
	public String getCustomer_ingate_time() {
		return customer_ingate_time;
	}
	public void setCustomer_ingate_time(String customer_ingate_time) {
		this.customer_ingate_time = customer_ingate_time;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(Integer customer_age) {
		this.customer_age = customer_age;
	}
	public Integer getCustomer_sex() {
		return customer_sex;
	}
	public void setCustomer_sex(Integer customer_sex) {
		this.customer_sex = customer_sex;
	}
	public Integer getCustomer_level() {
		return customer_level;
	}
	public void setCustomer_level(Integer customer_level) {
		this.customer_level = customer_level;
	}
	public Integer getCustomer_status() {
		return customer_status;
	}
	public void setCustomer_status(Integer customer_status) {
		this.customer_status = customer_status;
	}
	public Integer getCustomer_visit() {
		return customer_visit;
	}
	public void setCustomer_visit(Integer customer_visit) {
		this.customer_visit = customer_visit;
	}
	public Integer getCustomer_ingate() {
		return customer_ingate;
	}
	public void setCustomer_ingate(Integer customer_ingate) {
		this.customer_ingate = customer_ingate;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Customer [customer_no=" + customer_no + ", customer_name=" + customer_name + ", customer_academic="
				+ customer_academic + ", customer_region=" + customer_region + ", customer_post=" + customer_post
				+ ", customer_address=" + customer_address + ", customer_phone=" + customer_phone + ", customer_source="
				+ customer_source + ", customer_create_time=" + customer_create_time + ", customer_qq=" + customer_qq
				+ ", customer_course=" + customer_course + ", customer_onevisit_time=" + customer_onevisit_time
				+ ", customer_ingate_time=" + customer_ingate_time + ", customer_id=" + customer_id + ", customer_age="
				+ customer_age + ", customer_sex=" + customer_sex + ", customer_level=" + customer_level
				+ ", customer_status=" + customer_status + ", customer_visit=" + customer_visit + ", customer_ingate="
				+ customer_ingate + ", user_id=" + user_id + ", user=" + user + "]";
	}
	

}
