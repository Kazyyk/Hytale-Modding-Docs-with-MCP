# SoundEventLayer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.soundevent.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.SoundEventLayer>

public class SoundEventLayer implements NetworkSerializable<com.hypixel.hytale.protocol.SoundEventLayer>

## Fields

- protected transient float volume
- protected float startDelay
- protected boolean looping
- protected int probability
- protected float probabilityRerollDelay
- protected SoundEventLayer.RandomSettings randomSettings
- protected String[] files
- protected int roundRobinHistorySize
- protected transient int highestNumberOfChannels
- public static final SoundEventLayer.RandomSettings DEFAULT
- protected transient float minVolume
- protected transient float maxVolume
- protected transient float minPitch
- protected transient float maxPitch
- protected float maxStartOffset

## Methods

- public float getVolume()
- public float getStartDelay()
- public boolean isLooping()
- public int getProbability()
- public float getProbabilityRerollDelay()
- public SoundEventLayer.RandomSettings getRandomSettings()
- public String[] getFiles()
- public int getRoundRobinHistorySize()
- public int getHighestNumberOfChannels()
- @Nonnull public com.hypixel.hytale.protocol.SoundEventLayer toPacket()
- @Override @Nonnull public String toString()
- public float getMinVolume()
- public float getMaxVolume()
- public float getMinPitch()
- public float getMaxPitch()
- public float getMaxStartOffset()

## Inner Types

- `SoundEventLayer.RandomSettings`
