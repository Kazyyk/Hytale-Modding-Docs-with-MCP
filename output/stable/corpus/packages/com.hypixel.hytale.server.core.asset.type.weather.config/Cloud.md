# Cloud

Type: class | Package: com.hypixel.hytale.server.core.asset.type.weather.config

public class Cloud implements NetworkSerializable<com.hypixel.hytale.protocol.Cloud>

## Fields

- protected String texture
- protected TimeColorAlpha[] colors
- protected TimeFloat[] speeds

## Methods

- public Cloud(String texture, TimeColorAlpha[] colors, TimeFloat[] speeds)
- protected Cloud()
- public com.hypixel.hytale.protocol.Cloud toPacket()
- public String getTexture()
- public TimeColorAlpha[] getColors()
- public TimeFloat[] getSpeeds()
- public String toString()

Also in this package: DayTexture, FogOptions, TimeColor, TimeColorAlpha, TimeFloat, Weather

Complete API:
  public com.hypixel.hytale.protocol.Cloud toPacket()
  public String getTexture()
  public TimeColorAlpha[] getColors()
  public TimeFloat[] getSpeeds()
  public String toString()

Fields:
public static final BuilderCodec<Cloud> CODEC
protected String texture
protected TimeColorAlpha[] colors
protected TimeFloat[] speeds
