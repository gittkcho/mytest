println 'Project version: ' + project.properties['dist.project.version']
if (project.properties['dist.project.version'] != null) {
    def versionArray = project.properties['dist.project.version'].split('-')
    def minMaxVersionArray = versionArray[0].tokenize('.')
    if (project.properties['dist.project.version'].endsWith("-SNAPSHOT")) {
        project.properties['project.docker.latest.minmax.tag.version'] =
             minMaxVersionArray[0] + "." + minMaxVersionArray[1] + "-SNAPSHOT-latest"
     } else {
        project.properties['project.docker.latest.minmax.tag.version'] =
             minMaxVersionArray[0] + "." + minMaxVersionArray[1] + "-STAGING-latest"
     }
     println 'New tag for docker: ' + properties['project.docker.latest.minmax.tag.version']
}
