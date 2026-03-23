# InteractionEffects

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.InteractionEffects>

public class InteractionEffects implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionEffects>

Configures particles, sounds, trails, animations, camera effects, and movement effects applied during an interaction.

## Constants

- BuilderCodec<InteractionEffects> CODEC

## Key Methods

- public com.hypixel.hytale.protocol.InteractionEffects toPacket()
- public ModelParticle[] getParticles()
- public String getWorldSoundEventId()
- public int getWorldSoundEventIndex()
- public String getLocalSoundEventId()
- public int getLocalSoundEventIndex()
- public ModelTrail[] getTrails()
- public boolean isWaitForAnimationToFinish()
- public String getItemPlayerAnimationsId()
- public String getItemAnimationId()
- public boolean isClearAnimationOnFinish()
- public float getStartDelay()
- public MovementEffects getMovementEffects()
- protected void processConfig()
- public String toString()
