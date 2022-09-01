def call(name)
{
	echo "Name is: ${name}"
}
/*
def call(credId,username,IpAddrs)
{
    sshagent(['Tomcat-dev']) {
      IpAddrs.each{IpAddr->
  				//sh "mv target/*.war target/abhishek.war"
        //sh "scp -o StrictHostKeyChecking=no target/myweb-8.3.3.war ${username}@${IpAddr}:/opt/tomcat9/webapps/"
	      sh "scp -o StrictHostKeyChecking=no target/myweb-8.3.3.war ec2-user@172.31.85.108:/opt/tomcat9/webapps/"
					//sh "ssh ${username}@${IpAddr} /opt/tomcat9/bin/shutdown.sh"
					//sh "ssh ${username}@${IpAddr} /opt/tomcat9/bin/startup.sh"
      }
		}
}

*/
