# AmbienceFXBlockSoundSet

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: NetworkSerializable

public class AmbienceFXBlockSoundSet implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXBlockSoundSet>

Implements `NetworkSerializable`.

## Constants

- public static final Rangef DEFAULT_PERCENT

## Fields

- protected String blockSoundSetId
- protected transient int blockSoundSetIndex
- protected Rangef percent

## Methods

- @Nonnull public com.hypixel.hytale.protocol.AmbienceFXBlockSoundSet toPacket()
- public String getBlockSoundSetId()
- public Rangef getPercent()
- protected void processConfig()
- @Override public String toString()

Also in this package: AmbienceFX, AmbienceFXAmbientBed, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect

Complete API:
  public com.hypixel.hytale.protocol.AmbienceFXBlockSoundSet toPacket()
  public String getBlockSoundSetId()
  public Rangef getPercent()
  protected void processConfig()
  public String toString()

Fields:
public static final BuilderCodec<AmbienceFXBlockSoundSet> CODEC
public static final Rangef DEFAULT_PERCENT
protected String blockSoundSetId
protected transient int blockSoundSetIndex
protected Rangef percent
