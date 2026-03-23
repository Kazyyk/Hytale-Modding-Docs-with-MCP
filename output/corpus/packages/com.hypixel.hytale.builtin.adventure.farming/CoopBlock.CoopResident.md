# CoopBlock.CoopResident

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states

public static class CoopBlock.CoopResident

Represents a single resident record within a CoopBlock. Tracks the captured NPC metadata, a persistent reference to the spawned entity in the world, whether the entity is currently deployed, and the last time produce was harvested.

## Fields

- protected CapturedNPCMetadata metadata
- @Nullable protected PersistentRef persistentRef
- protected boolean deployedToWorld
- protected Instant lastProduced

## Methods

- public CapturedNPCMetadata getMetadata()
- @Nullable public PersistentRef getPersistentRef()
- public void setPersistentRef(@Nullable PersistentRef persistentRef)
- public boolean getDeployedToWorld()
- public void setDeployedToWorld(boolean deployedToWorld)
- public Instant getLastProduced()
- public void setLastProduced(Instant lastProduced)
