# AmbienceFXAmbientBed

Type: class | Package: com.hypixel.hytale.server.core.asset.type.ambiencefx.config | Implements: NetworkSerializable

public class AmbienceFXAmbientBed implements NetworkSerializable<com.hypixel.hytale.protocol.AmbienceFXAmbientBed>

Implements `NetworkSerializable`.

## Fields

- protected String track
- protected float decibels
- protected transient float volume
- protected AmbienceTransitionSpeed transitionSpeed

## Methods

- @Nonnull public com.hypixel.hytale.protocol.AmbienceFXAmbientBed toPacket()
- public String getTrack()
- public float getDecibels()
- public float getVolume()
- public AmbienceTransitionSpeed getTransitionSpeed()
- protected void processConfig()
- @Override public String toString()
