# AmbienceFXSound

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: NetworkSerializable

public class AmbienceFXSound implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXSound>

Implements `NetworkSerializable`.

## Constants

- public static final Rangef DEFAULT_FREQUENCY
- public static final Range DEFAULT_RADIUS

## Fields

- protected String soundEventId
- protected transient int soundEventIndex
- protected AmbienceFXSoundPlay3D play3D
- protected String blockSoundSetId
- protected transient int blockSoundSetIndex
- protected AmbienceFXAltitude altitude
- protected Rangef frequency
- protected Range radius

## Methods

- @Nonnull public com.hypixel.hytale.protocol.AmbienceFXSound toPacket()
- public String getSoundEventId()
- public int getSoundEventIndex()
- public AmbienceFXSoundPlay3D getPlay3D()
- public String getBlockSoundSetId()
- public AmbienceFXAltitude getAltitude()
- public Rangef getFrequency()
- public Range getRadius()
- protected void processConfig()
- @Override public String toString()

Also in this package: AmbienceFX, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSoundEffect

Complete API:
  public com.hypixel.hytale.protocol.AmbienceFXSound toPacket()
  public String getSoundEventId()
  public int getSoundEventIndex()
  public AmbienceFXSoundPlay3D getPlay3D()
  public String getBlockSoundSetId()
  public AmbienceFXAltitude getAltitude()
  public Rangef getFrequency()
  public Range getRadius()
  protected void processConfig()
  public String toString()

Fields:
public static final BuilderCodec<AmbienceFXSound> CODEC
public static final Rangef DEFAULT_FREQUENCY
public static final Range DEFAULT_RADIUS
protected String soundEventId
protected transient int soundEventIndex
protected AmbienceFXSoundPlay3D play3D
protected String blockSoundSetId
protected transient int blockSoundSetIndex
protected AmbienceFXAltitude altitude
protected Rangef frequency
protected Range radius
