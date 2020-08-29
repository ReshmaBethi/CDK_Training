package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDeveloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer developer = new Developer("name", 1, "JAVA", Arrays.asList("mobile app", "banking"), 1234l);
		Developer developer1 = new Developer("name1", 10, ".Net", Arrays.asList("server1 app", "server2 app"), 1000l);
		Developer developer2 = new Developer("name2", 2, "JAVA", Arrays.asList("notepad", "banking"), 4000l);
		Developer developer9 = new Developer("name1", 9, "Testing", Arrays.asList("mobile app", "banking"), 5234l);
		Developer developer4 = new Developer("name4", 4, "JAVA", Arrays.asList("web app1", "web app2"), 5234l);
		Developer developer5 = new Developer("name5", 5, "JAVA", Arrays.asList("web app2", "banking"), 7899l);
		Developer developer8 = new Developer("name8", 8, "JAVA", Arrays.asList("web app1", "web app2"), 5678l);
		Developer developer10 = new Developer("name10", 12, "Testing", Arrays.asList("mobile app", "banking"), 5234l);

		List<Developer> developers = new ArrayList<Developer>();
		developers.add(developer);
		developers.add(developer1);
		developers.add(developer2);
		developers.add(developer9);
		developers.add(developer4);
		developers.add(developer5);
		developers.add(developer8);
		developers.add(developer10);

		/*developers.forEach((li)->{
			return li.getEmpId()+li.getName();
		});*/
		
		developers.forEach((li)->{
			System.out.println(li.getEmpId());
		});
		
		
		List<Developer> testers = developers.stream().filter((d)->{
			return d.getTechnology().equals("Testing");
			}).collect(Collectors.toList());
		
		testers.forEach((t)->{
			System.out.println(t.getEmpId()+" : "+t.getName());
		});
		
		List<String> developers1= developers.stream().filter((d)->{
			return d.getTechnology().equals("JAVA");
			}).map(d->d.getName()).collect(Collectors.toList());
		System.out.println(developers1);
		
		Long total_sal=developers.stream().map(d->d.getSalary()).reduce(0l, Long::sum);
		System.out.println("Total Salary : "+total_sal);
		
		long totalSalary1=developers.stream().collect(Collectors.summingLong((d)->{
			return d.getSalary();
		}));
		System.out.println("Tot sal : "+totalSalary1);
		
		LongSummaryStatistics stats = developers.stream().collect(Collectors.summarizingLong((d)->{
			return d.getSalary();
		}));
		
		System.out.println(stats);
		
		Map<String, List<Developer>> group=developers.stream()
				.collect(Collectors.groupingBy(Developer::getTechnology));
		System.out.println(group);
		
		group.entrySet().stream().forEach((entry)->{
			System.out.println("*******"+entry.getKey()+"****");
			for(Developer deve: entry.getValue()){
				System.out.println(deve);
			}
		});
		
		Map<String, Long> group_count = developers.stream()
				.collect(Collectors.groupingBy(Developer::getTechnology,Collectors.counting()));
		System.out.println(group_count);
		
		Map<Boolean, List<Developer>> partition=developers.stream().
				collect(Collectors.partitioningBy((d)->{
					return d.getTechnology().equals("JAVA");
				}));
		System.out.println(partition);
		partition.entrySet().stream().forEach((entry)->{
			System.out.println("********"+entry.getKey()+"********");
			for(Developer deve : entry.getValue()){
				System.out.println(deve);
			}
		});
		
	}

}
