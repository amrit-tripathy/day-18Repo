package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component(value="DbUtils")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class DbUtils implements DbInterface{
	
	Connection con;
	@Override
	public List<Regions> getAll()  {
		String query="select * from regions";
		List<Regions> rlist=new ArrayList<Regions>();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				rlist.add(new Regions(rs.getString(2),rs.getInt(1)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rlist;
	}

	@Override
	public Regions addRegion(Regions region) {
		// TODO Auto-generated method stub
		String query ="insert into regions values(?,?) ";
		Regions r= null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, region.getRid());
			ps.setString(2, region.getRname());
			int x = ps.executeUpdate();
			if(x==1) {
				r=region;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
	}

	@Override
	public String deleteRegion(int id) {
		// TODO Auto-generated method stub
		String query="delete from regions where region_id=?";
		String str=null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int x = ps.executeUpdate();
			if(x==1) {
				str="row deleted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public Regions updateRegion(Regions region) {
		// TODO Auto-generated method stub
		String query="update regions set region_name=? where region_id=?";
		String query1="select * from regions where region_id=?";
		Regions r=null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps.setString(1, region.getRname());
			ps.setInt(2, region.getRid());
			ps.executeUpdate();
			ps1.setInt(1, region.getRid());
			ResultSet rs = ps1.executeQuery();
			if(rs.next()) {
				r = new Regions(rs.getString(2),rs.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

}
