package swervelib.encoders;

public class PWMDutyCycleEncoderSwerve extends SwerveAbsoluteEncoder{
    private DutyCycleEncoder encoder;
    private boolean isInverted;
    public PWMDutyCycleEncoderSwerve(int id){
        encoder = new DutyCycleEncoder(id);
    }
    @Override
    public void configure(boolean i){
        isInverted = i;
    }
    @Override
    public double getAbsolutePosition(){
        return (isInverted ? -1.0 : 1.0) * encoder.getAbsolutePosition() * 360;
    }
    @Override
    public Object getAbsoluteEncoder(){
        return encoder;
    }
        
    /**
   * Reset the encoder to factory defaults.
   */
  @Override
  public void factoryDefault()
  {
    // Do nothing
  }

  /**
   * Clear sticky faults on the encoder.
   */
  @Override
  public void clearStickyFaults()
  {
    // Do nothing
  }

}