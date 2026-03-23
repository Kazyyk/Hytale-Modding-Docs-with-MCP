# EntityStatType.EntityStatEffects

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Implements: NetworkSerializable<EntityStatEffects>

public static class EntityStatType.EntityStatEffects implements NetworkSerializable<EntityStatEffects>

Configures effects triggered when an entity stat reaches its minimum or maximum value. Can play a sound event, spawn particles, and trigger interaction chains.

## Fields

- triggerAtZero | boolean | TriggerAtZero | If true, effects trigger at zero crossing instead of at the bound value.
- soundEventId | String | SoundEventId | Sound event to play. Resolved to index on decode.
- particles | ModelParticle[] | Particles | Particle effects to spawn.
- interactions | String | Interactions | Root interaction chain to execute.

## Methods

- getSoundEventId() | String | Returns the sound event identifier.
- getSoundEventIndex() | int | Returns the resolved sound event index.
- getParticles() | ModelParticle[] | Returns particle configurations.
- getInteractions() | String | Returns the interaction chain identifier.
- triggerAtZero() | boolean | Whether to trigger at zero crossing.
- toPacket() | EntityStatEffects` (protocol) | Converts to network packet format.

Also in this package: DefaultEntityStatTypes, EntityStatType, EntityStatTypePacketGenerator, RegenType, Regenerating

Complete API:
  public String getSoundEventId()
  public int getSoundEventIndex()
  public ModelParticle[] getParticles()
  public String getInteractions()
  public boolean triggerAtZero()
  public com.hypixel.hytale.protocol.EntityStatEffects toPacket()
  public String toString()

Fields:
public static final BuilderCodec<EntityStatType.EntityStatEffects> CODEC
private boolean triggerAtZero
private String soundEventId
private int soundEventIndex
private ModelParticle[] particles
private String interactions
