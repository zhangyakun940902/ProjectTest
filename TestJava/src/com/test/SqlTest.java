package com.test;

import java.util.HashMap;
import java.util.Map;

public class SqlTest {

	public static void main(String[] args) {
		
		
		String sql="create table 010c1ce4.vra_010_res_955d4be_tmp0 as select "
					+"parta.month_id,parta.prov_id,parta.user_id,parta.package_id,parta.discnt_code,"
					+"parta.spec_flag,parta.item_id,parta.start_date,parta.end_date,partb.discnt_name,"
					+"partb.discnt_explain from 010c1ce4.c01009_user_discnt_p parta inner join 9998427d.c01017_discnt_0000 partb "
					+"on parta.discnt_code = partb.discnt_code where parta.month_id = '201706' and parta.start_date <= '20170631' "
					+"and parta.end_date >= '20170601' and partb.month_id = '201706'";
		
		String sql2 = "create table 010c1ce4.vra_010_res_955d4be_tmp1 as "
					+"select parta.month_id,parta.prov_id,parta.prov_name,parta.area_id,parta.area_name,parta.city_code,parta.city_name,"
					+"parta.serial_number,parta.user_id,parta.cust_id,parta.cust_name,parta.cust_type_desc,parta.acct_id,parta.pay_name,"
					+"parta.net_type_code_desc,parta.open_date,parta.prepay_tag_desc,parta.brand_code,parta.use_product_id,parta.use_product_name,"
					+"parta.user_state,parta.remove_tag_desc,parta.last_stop_time,parta.open_depart_id,parta.open_depart_name,parta.open_staff_id,"
					+"parta.open_staff_name,parta.open_depart_kind,parta.fee2,parta.writeoff_fee1,parta.b_discnt,parta.a_discnt,parta.fee "
					+"from 010c1ce4.user_base_info parta where  parta.net_type_code_desc = '互联网接入业务' and parta.month_id = '201706' and parta.remove_tag_desc = '在用'";
		
		String sql3="create table 010c1ce4.vra_010_res_955d4be_tmp0 as select parta.month_id,parta.prov_id,parta.user_id,parta.package_id,parta.discnt_code,parta.spec_flag,parta.item_id,parta.start_date,parta.end_date,partb.discnt_name,partb.discnt_explain from 010c1ce4.c01009_user_discnt_p parta inner join 9998427d.c01017_discnt_0000 partb on parta.discnt_code = partb.discnt_code where parta.month_id = '201706' and parta.start_date <= '20170631' and parta.end_date >= '20170601' and partb.month_id = '201706'";
		
		String sql4="insert into table 010c1ce4.vra_010_res_955d4be select concat_ws('#','20170802',{function}),'20170802','V(蒙)RA23.02.02-miaogs-08021500','V(蒙)RA23.02.02-miaogs-08021500_010_RUL_cdfd31f',partb.month_id,partb.prov_id,parta.prov_name,parta.area_id,parta.area_name,parta.city_code,parta.city_name,parta.city_code,parta.serial_number,partb.user_id,parta.cust_id,concat('*',substr(parta.cust_name,2)),parta.cust_type_desc,parta.acct_id,parta.pay_name,parta.net_type_code_desc,parta.open_date,parta.prepay_tag_desc,parta.use_product_id,parta.use_product_name,parta.user_state,parta.remove_tag_desc,'',parta.last_stop_time,parta.open_depart_id,parta.open_depart_name,parta.open_staff_id,parta.open_staff_name,parta.open_depart_kind,parta.fee2,parta.writeoff_fee1,parta.b_discnt,parta.a_discnt,parta.fee,partb.discnt_code,partb.discnt_name,partb.discnt_explain,partb.spec_flag,partb.start_date,partb.end_date,partb.package_id,partb.item_id,'0','','1','','','0','0','0','0','','','','0','','','0','','','','' from 010c1ce4.vra_010_res_955d4be_tmp1 parta left join 010c1ce4.vra_010_res_955d4be_tmp0 partb on parta.user_id = partb.user_id where partb.discnt_name like '%宽带%M%年%' or partb.discnt_name like '%M%宽带%包%'";
		
		String sql5="create table 010c1ce4.vra_010_res_955d4be_tmp1 as select parta.month_id,parta.prov_id,parta.prov_name,parta.area_id,parta.area_name,parta.city_code,parta.city_name,parta.serial_number,parta.user_id,parta.cust_id,parta.cust_name,parta.cust_type_desc,parta.acct_id,parta.pay_name,parta.net_type_code_desc,parta.open_date,parta.prepay_tag_desc,parta.brand_code,parta.use_product_id,parta.use_product_name,parta.user_state,parta.remove_tag_desc,parta.last_stop_time,parta.open_depart_id,parta.open_depart_name,parta.open_staff_id,parta.open_staff_name,parta.open_depart_kind,parta.fee2,parta.writeoff_fee1,parta.b_discnt,parta.a_discnt,parta.fee from 010c1ce4.user_base_info parta where parta.month_id = '201706' and parta.net_type_code_desc = '互联网接入业务' and parta.remove_tag_desc = '在用'";
		
		String sql6="create table 010c1ce4.vra_010_res_308fc95_tmp0 as select distinct parta.prepay_tag_desc,parta.month_id,parta.prov_id,parta.prov_name,parta.area_id,parta.area_name,parta.city_code,parta.city_name,parta.serial_number,coalesce(parta.user_id,partb.user_id) as user_id,parta.cust_id,parta.cust_name,parta.user_type_code_desc,parta.brand_code,parta.total_dura,parta.total_nums,parta.out_cnt,parta.out_dura,parta.total_sms_num,parta.free_flux,parta.bill_flux,parta.sum_score_value,parta.cust_type_desc,parta.acct_id,parta.use_product_id,parta.use_product_name,parta.user_state,parta.remove_tag_desc,parta.pay_name,parta.net_type_code_desc,parta.destroy_time,parta.last_stop_time,parta.open_depart_id,parta.open_depart_name,parta.open_staff_id,parta.open_staff_name,parta.open_depart_kind,parta.hy_product_id,parta.hy_product_name,parta.product_type_name,parta.hy_start_date,parta.hy_end_date,parta.hy_staff_id,parta.hy_staff_name,parta.hy_depart_id,parta.hy_depart_name,parta.hy_depart_kind,parta.mobile_cost,parta.device_name,parta.hy_imei,parta.hysub_imei,parta.end_date2,parta.start_date2,parta.product_type_name2,parta.product_name2,parta.product_id2,parta.develop_staff_id,parta.develop_staff_name,parta.develop_depart_id,parta.develop_depart_name,parta.develop_depart_type,parta.develop_depart_kind,parta.sum_comm_fee,parta.total_flux,parta.flux_num,parta.total_dura_flux,parta.good_no_class,parta.low_attr_value,parta.xs_fee,parta.qq_fee,parta.fw_fee,parta.jf_fee,parta.wx_fee,partb.package_id,partb.discnt_code,partb.start_date,partb.end_date,parta.open_date,parta.assure_type,parta.end_assure_date,parta.credit_value,parta.owe_monthx,parta.owe_monthd,parta.is_vip,parta.vip_card_start_date,parta.mon,parta.sumfee,parta.trade_id,parta.trade_type,parta.last_depart_id,parta.last_depart_name,parta.last_staff_id,parta.last_staff_name,parta.trade_depart_kind,parta.vip_card_end_date,parta.is_black,parta.is_red,parta.is_good_no from 010c1ce4.user_base_info parta full join 010c1ce4.c01009_user_discnt_p partb on parta.user_id = partb.user_id where parta.month_id = '201707' and parta.user_state != '开通' and parta.last_stop_time <= '20170731235959' and parta.is_good_no = '否' and partb.month_id = '201707' and partb.discnt_code in ('7023600','7023700','8151750','8141668','7023800') and partb.start_date <= '20170731235959' and partb.end_date <= '20170701000000'";
		
		String sql7 = "insert into table 010c1ce4.vra_010_res_308fc95 select concat_ws('#','20171110',{function}),'20171110','V(蒙)RA25.04-miaogs-11101823','V(蒙)RA25.04-miaogs-11101823_010_RUL_931b340',partb.month_id,partb.prov_id,partb.prov_name,partb.area_id,partb.area_name,partb.city_code,partb.city_name,partb.city_code,partb.serial_number,partb.user_id,partb.cust_id,concat('*',substr(partb.cust_name,2)),partb.acct_id,partb.pay_name,partb.net_type_code_desc,partb.open_date,partb.use_product_id,partb.use_product_name,partb.user_state,partb.remove_tag_desc,partb.destroy_time,partb.last_stop_time,partb.open_depart_id,partb.open_depart_name,partb.open_staff_id,partb.open_staff_name,partb.open_depart_kind,partb.fee2,partb.owe_monthx,partb.owe_monthd,partb.mon,partb.sumfee,partb.trade_type,partb.last_depart_id,partb.last_depart_name,partb.last_staff_id,partb.last_staff_name,partb.trade_depart_kind,partb.is_red,partb.is_good_no,'0','','1','','','0','0','0','0','','','','0','','','0','','','','',parta.discnt_code,parta.start_date,parta.end_date,parta.package_id from 010c1ce4.vra_010_res_308fc95_tmp0 parta inner join 010c1ce4.user_base_info partb on parta.user_id = partb.user_id where partb.month_id = '201708' and partb.fee2 > 0";
		
		System.out.println(checksplit(sql6));
	}

	public static int checksplit(String procsql){
		
		String []wheretemp =procsql.split("where");
		if(wheretemp.length > 1 ){
			if(wheretemp[0].contains("full join") ){//全连接
				String []fromtemp = wheretemp[0].split("from");//from分割
				String []fulljointemp = fromtemp[1].split("full join");
				String partaname= fulljointemp[0];//表1
				String []ontemp = fulljointemp[1].split("on");
				String partbname = ontemp[0];//表2
				//判断表1
				if(wheretemp[1].contains("parta.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("parta.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from " +partaname+" where "+ datestr +" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}
				// 判断表2
				if(wheretemp[1].contains("partb.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("partb.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from "+partbname+" where "+ datestr +" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}else{
					return 1;
				}//else
				
			}else if(wheretemp[0].contains("right join") ){//右连接
				
				String []fromtemp = wheretemp[0].split("from");//from分割
				String []innerjointemp = fromtemp[1].split("right join");
				String partaname= innerjointemp[0];//表1
				String []ontemp = innerjointemp[1].split("on");
				String partbname = ontemp[0];//表2
				//判断表1
				if(wheretemp[1].contains("parta.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("parta.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from " +partaname+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}
				// 判断表2
				if(wheretemp[1].contains("partb.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("partb.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from "+partbname+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}else{
					return 1;
				}//else
				
				
			}else if(wheretemp[0].contains("inner join") ){//等值连接
				
				String []fromtemp = wheretemp[0].split("from");//from分割
				String []innerjointemp = fromtemp[1].split("inner join");
				String partaname= innerjointemp[0];//表1
				String []ontemp = innerjointemp[1].split("on");
				String partbname = ontemp[0];//表2
				//判断表1
				if(wheretemp[1].contains("parta.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("parta.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from " +partaname+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}
				// 判断表2
				if(wheretemp[1].contains("partb.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("partb.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from "+partbname+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}else{
					return 1;
				}//else
				
				
			}else if(wheretemp[0].contains("left join")){//左连接
				
				String []fromtemp = wheretemp[0].split("from");//from分割
				String []innerjointemp = fromtemp[1].split("left join");
				String partaname= innerjointemp[0];//表1
				String []ontemp = innerjointemp[1].split("on");
				String partbname = ontemp[0];//表2
				//判断表1
				if(wheretemp[1].contains("parta.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("parta.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from " +partaname+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}
				// 判断表2
				if(wheretemp[1].contains("partb.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("partb.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from "+partbname+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}else{
					return 1;
				}//else
				
			}else{//单表
				String []fromtemp = wheretemp[0].split("from");
				String tablename = fromtemp[1];//取得表名
				if(wheretemp[1].contains("parta.month_id")){//判断是否有month_id
					int numindex = wheretemp[1].lastIndexOf("parta.month_id = ");
					String datestr = wheretemp[1].substring(numindex,numindex+25);
					System.out.println(datestr);
					String []montharr = datestr.split("=");
					String pattern="^\\d{4}(0[1-9]|1[0-2])$";
					if(montharr[1].trim().replace("'","").matches(pattern)){
						String sql="select * from "+tablename+" where "+ datestr+" limit 10;";
						System.out.println(sql);
						//exec(sql);
					}
				}else{
					return 1;
				}//else
			}
		}else{
			return 1;//可通过
		}//else
		return 1;//可通过
	}//checksplit
	
}
