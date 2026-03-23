# JumpOperation

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.operation | Implements: Operation

public class JumpOperation implements Operation

Implementation of `Operation`.

## Fields

- target | Label | final Label field.

## Constructors

- JumpOperation(Label target) | Creates a new JumpOperation instance.

## Methods

- getWaitForDataFrom() | WaitForDataFrom | public method.
- toString() | String | public method.

Also in this package: Label, LabelOperation, NestedOperation, Operation, OperationsBuilder

Complete API:
  public void tick(Ref<EntityStore> ref, LivingEntity entity, boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void simulateTick(Ref<EntityStore> ref, LivingEntity entity, boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public WaitForDataFrom getWaitForDataFrom()
  public String toString()

Fields:
private final Label target
