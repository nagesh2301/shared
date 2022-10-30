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
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${172.31.21.218}:/var/lib/tomcat8/webapps/${context}.war"
}
