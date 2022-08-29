def call(name)
{
	echo "Name is: ${name}"
}
/*
def call(credId,username,IpAddrs)
{
    sshagent([credId]) {
      IpAddrs.each{IpAddr->
  				sh "mv target/*.war target/abhishek.war"
        sh "scp -o StrictHostKeyChecking=no target/abhishek.war ${username}@${IpAddr}:/opt/tomcat9/webapps/"
					sh "ssh ${username}@${IpAddr} /opt/tomcat9/bin/shutdown.sh"
					sh "ssh ${username}@${IpAddr} /opt/tomcat9/bin/startup.sh"
      }
		}
}
*/
