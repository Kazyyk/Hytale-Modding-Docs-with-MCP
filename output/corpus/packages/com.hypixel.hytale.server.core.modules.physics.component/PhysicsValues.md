# PhysicsValues

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.component | Implements: Component<EntityStore>

public class PhysicsValues implements Component<EntityStore>

ECS component storing an entity's core physics parameters: mass, drag coefficient, and gravity inversion. Serialized via `BuilderCodec` with the keys `"Mass"`, `"DragCoefficient"`, and `"InvertedGravity"`. Default values are mass=1.0, drag=0.5, invertedGravity=false.

## Fields

- ZERO | Double | Static constant `0.0`, used as validator threshold.
- CODEC | BuilderCodec<PhysicsValues> | Serialization codec with validation (mass > 0, drag >= 0).
- mass | double | Entity mass. Default 1.0.
- dragCoefficient | double | Drag coefficient. Default 0.5.
- invertedGravity | boolean | Whether gravity is inverted for this entity.

## Constructors

- PhysicsValues() | Creates with default values (mass=1.0, drag=0.5, invertedGravity=false).
- PhysicsValues(@Nonnull PhysicsValues other) | Copy constructor.
- PhysicsValues(double mass, double dragCoefficient, boolean invertedGravity) | Creates with specified values.

## Methods

- getComponentType() | ComponentType<EntityStore, PhysicsValues> | Static. Returns the registered component type.
- replaceValues(@Nonnull PhysicsValues other) | void | Copies all values from another instance.
- resetToDefault() | void | Resets mass, drag, and gravity to defaults.
- scale(float scale) | void | Multiplies mass and drag coefficient by the given scale factor.
- getMass() | double | Returns the mass value.
- getDragCoefficient() | double | Returns the drag coefficient.
- isInvertedGravity() | boolean | Returns whether gravity is inverted.
- getDefault() | PhysicsValues | Static. Returns a new instance with default values.
- clone() | Component<EntityStore> | Returns a copy of this component.
