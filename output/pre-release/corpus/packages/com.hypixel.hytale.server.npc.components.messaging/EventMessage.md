# EventMessage

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging | Extends: NPCMessage

public class EventMessage extends NPCMessage

## Fields

- private final Vector3d position
- private final double maxRangeSquared
- private boolean sameFlock

## Constructors

- public EventMessage(double maxRange)
- private EventMessage(@Nonnull Vector3d position, double maxRangeSquared, boolean sameFlock)

## Methods

- @Nonnull public Vector3d getPosition()
- public double getMaxRangeSquared()
- public boolean isSameFlock()
- public void setSameFlock(boolean sameFlock)
- public void activate(double x, double y, double z, Ref<EntityStore> target, double age)
- @Nonnull public EventMessage clone()
