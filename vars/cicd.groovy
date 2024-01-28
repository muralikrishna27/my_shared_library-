def newGit(repo)
{
  git "https://github.com/muralikrishna27/${repo}"
}

def newBuild()
{
  sh 'mvn package'
}

def newDeploy(jobname,ip,context)
{
sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
def runselenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
