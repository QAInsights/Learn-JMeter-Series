@Grapes(
    @Grab(group='joda-time', module='joda-time', version='2.10.14')
)
import org.joda.time.LocalDateTime

try {
	LocalDateTime currentDateTime = new LocalDateTime()
	log.info "Local Time is " + currentDateTime
}

catch (Exception e){
    SampleResult.setSuccessful(false)
    SampleResult.setResponseMessage(e.getMessage())
    SampleResult.setResponseCode(null)
}
