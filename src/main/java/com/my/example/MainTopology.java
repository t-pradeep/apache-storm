package com.my.example;

import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;

public class MainTopology {

	public static void main(String[] args) throws Exception {

		TopologyBuilder builder = new TopologyBuilder();
		builder.setSpout("IntegerSpout", new IntegerSpout());
		builder.setBolt("MultiplierBolt", new MultiplierBolt()).shuffleGrouping("IntegerSpout");

		Config config = new Config();
		
		LocalCluster cluster = new LocalCluster();
		try {
		cluster.submitTopology("MainTopology", config, builder.createTopology());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			cluster.shutdown();
		}

	}

}
