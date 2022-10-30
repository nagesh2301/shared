def newGit(repo)
{
  git "${repo}"
}


def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobname,IP, context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${IP}:/var/lib/tomcat8/webapps/${context}.war"
  

}
