def newGit(repo)
{
  git "${repo}"
}


def newMaven()
{
  sh 'mvn package'
}

def newDeploy(workspace,IP, context)
{
  sh "scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@${IP}:/var/lib/tomcat9/webapps/${context}.war"
 
}

def newSelenium(workspace)
{
  sh "java -jar ${WORKSPACE}/testing.jar"
 
}
