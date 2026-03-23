# ActionSpawnParticles

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual | Extends: ActionBase

public class ActionSpawnParticles extends ActionBase

## Fields

- protected final String particleSystem
- protected final double range
- protected final Vector3d offset
- protected final ModelParticle[] modelParticlesProtocol

## Constructors

- public ActionSpawnParticles(@Nonnull BuilderActionSpawnParticles builder, @Nonnull BuilderSupport support)

## Methods

- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionAppearance, ActionDisplayName, ActionModelAttachment, ActionPlayAnimation, ActionPlaySound, SensorAnimation

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final String particleSystem
protected final double range
protected final Vector3d offset
protected final ModelParticle[] modelParticlesProtocol
