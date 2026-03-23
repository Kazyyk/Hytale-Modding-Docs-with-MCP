# AmbienceFXSoundEffect

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: NetworkSerializable

public class AmbienceFXSoundEffect implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXSoundEffect>

Implements `NetworkSerializable`.

## Fields

- @Nullable protected String reverbEffectId
- protected transient int reverbEffectIndex
- @Nullable protected String equalizerEffectId
- protected transient int equalizerEffectIndex
- protected boolean isInstant

## Methods

- protected void processConfig()
- @Nonnull public com.hypixel.hytale.protocol.AmbienceFXSoundEffect toPacket()
- @Nullable public String getReverbEffectId()
- public int getReverbEffectIndex()
- @Nullable public String getEqualizerEffectId()
- public int getEqualizerEffectIndex()
- public boolean isInstant()
- @Override public String toString()

Also in this package: AmbienceFX, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound

Complete API:
  protected void processConfig()
  public com.hypixel.hytale.protocol.AmbienceFXSoundEffect toPacket()
  public String getReverbEffectId()
  public int getReverbEffectIndex()
  public String getEqualizerEffectId()
  public int getEqualizerEffectIndex()
  public boolean isInstant()
  public String toString()

Fields:
public static final BuilderCodec<AmbienceFXSoundEffect> CODEC
protected String reverbEffectId
protected transient int reverbEffectIndex
protected String equalizerEffectId
protected transient int equalizerEffectIndex
protected boolean isInstant
