# AmbienceFXMusic

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: NetworkSerializable

public class AmbienceFXMusic implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXMusic>

Implements `NetworkSerializable`.

## Fields

- protected String[] tracks
- protected float decibels
- protected transient float volume

## Methods

- @Nonnull public com.hypixel.hytale.protocol.AmbienceFXMusic toPacket()
- public String[] getTracks()
- public float getDecibels()
- public float getVolume()
- protected void processConfig()
- @Override public String toString()
