/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Hari Venkatesh
 */

class  Capture1
{ 
	@Override
	public String toString() {
		return "Capture [src_ip=" + src_ip + ", hopCount=" + hopCount + ", dest_ip=" + dest_ip + ", seq_no=" + seq_no
				+ "]";
	}
	private String src_ip; 
	private int hopCount; 
	private String dest_ip; 
	private int seq_no;
	public Capture1(String src, int hc, String dest, int seq) 
	{ 
		this.src_ip = src; 
		this.hopCount = hc; 
		this.dest_ip = dest;
		this.seq_no = seq;
	}
	public String getSrc_ip() {
		return src_ip;
	}
	public int getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}
	public void setSrc_ip(String src_ip) {
		this.src_ip = src_ip;
	}
	public int getHopCount() {
		return hopCount;
	}
	public void setHopCount(int hopCount) {
		this.hopCount = hopCount;
	}
	public String getDest_ip() {
		return dest_ip;
	}
	public void setDest_ip(String dest_ip) {
		this.dest_ip = dest_ip;
	}
}

