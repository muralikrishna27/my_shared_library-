def newGit(repo)
{
  git "https://github.com/muralikrishna27/${repo}"
}

def neBuild()
{
  sh 'mvn package'
}
