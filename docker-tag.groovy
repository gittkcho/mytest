println 'HERE';
println 'Project version: ' + project.properties['dist.project.version'];
def versionArray;
if ( project.properties['dist.project.version'] != null ) {
    versionArray = project.properties['dist.project.version'].split('-');
}
if ( project.properties['dist.project.version'].endsWith("-SNAPSHOT") ) {
    println 'HERE0';
    project.properties['project.docker.latesttag.version']=versionArray[0] + "-SNAPSHOT-latest";
} else {
    project.properties['project.docker.latesttag.version']=versionArray[0] + "-STAGING-latest";
}
println 'New tag for docker: ' + project.properties['project.docker.latesttag.version'];
