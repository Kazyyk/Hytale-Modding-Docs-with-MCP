# Velocity

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.component | Implements: Component<EntityStore>

public class Velocity implements Component<EntityStore>

ECS component representing an entity's velocity state. Maintains both a server-authoritative velocity vector and a separate client velocity vector. Supports queuing velocity instructions for deferred application during the physics tick. Serialized via `BuilderCodec` with key `"Velocity"`.

## Fields

- CODEC | BuilderCodec<Velocity> | Serialization codec for the velocity component.
- instructions | List<Velocity.Instruction> | Queued velocity change instructions.
- velocity | Vector3d | The server-authoritative velocity vector.
- clientVelocity | Vector3d | The client-side velocity vector.

## Constructors

- Velocity() | Creates a zero-velocity component.
- Velocity(@Nonnull Velocity other) | Copy constructor.
- Velocity(@Nonnull Vector3d initialVelocity) | Creates with the given initial velocity.

## Methods

- getComponentType() | ComponentType<EntityStore, Velocity> | Static. Returns the registered component type.
- setZero() | void | Resets velocity to (0, 0, 0).
- addForce(@Nonnull Vector3d force) | void | Adds a force vector to the current velocity.
- addForce(double x, double y, double z) | void | Adds a force by components.
- set(@Nonnull Vector3d newVelocity) | void | Sets velocity from a vector.
- set(double x, double y, double z) | void | Sets velocity by components.
- setClient(@Nonnull Vector3d newVelocity) | void | Sets the client velocity from a vector.
- setClient(double x, double y, double z) | void | Sets the client velocity by components.
- setX(double x) | void | Sets the X component.
- setY(double y) | void | Sets the Y component.
- setZ(double z) | void | Sets the Z component.
- getX() | double | Returns the X component.
- getY() | double | Returns the Y component.
- getZ() | double | Returns the Z component.
- getSpeed() | double | Returns the magnitude (length) of the velocity vector.
- addInstruction(@Nonnull Vector3d velocity, @Nullable VelocityConfig config, @Nonnull ChangeVelocityType type) | void | Queues a velocity change instruction for deferred processing.
- getInstructions() | List<Velocity.Instruction> | Returns the list of queued instructions.
- getVelocity() | Vector3d | Returns the server velocity vector.
- getClientVelocity() | Vector3d | Returns the client velocity vector.
- assignVelocityTo(@Nonnull Vector3d vector) | Vector3d | Copies this velocity into the given vector and returns it.
- clone() | Component<EntityStore> | Returns a copy of this component.

## Inner Classes

- Instruction | Holds a velocity vector, optional `VelocityConfig`, and `ChangeVelocityType` for deferred application.

Also in this package: Instruction, PhysicsValues

Complete API:
  public static ComponentType<EntityStore,Velocity> getComponentType()
  public void setZero()
  public void addForce(Vector3d force)
  public void addForce(double x, double y, double z)
  public void set(Vector3d newVelocity)
  public void set(double x, double y, double z)
  public void setClient(Vector3d newVelocity)
  public void setClient(double x, double y, double z)
  public void setX(double x)
  public void setY(double y)
  public void setZ(double z)
  public double getX()
  public double getY()
  public double getZ()
  public double getSpeed()
  public void addInstruction(Vector3d velocity, VelocityConfig config, ChangeVelocityType type)
  public List<Velocity.Instruction> getInstructions()
  public Vector3d getVelocity()
  public Vector3d getClientVelocity()
  public Vector3d assignVelocityTo(Vector3d vector)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<Velocity> CODEC
protected final List<Velocity.Instruction> instructions
protected final Vector3d velocity
protected final Vector3d clientVelocity
