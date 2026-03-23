# SpawnBlockCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world | Extends: AbstractWorldCommand

public class SpawnBlockCommand extends AbstractWorldCommand

## Fields

- private final RequiredArg<String> blockArg
- private final RequiredArg<RelativeDoublePosition> positionArg
- private final DefaultArg<Vector3f> rotationArg

## Methods

- @Override protected void execute(CommandContext context, World world, Store<EntityStore> store)

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<String> blockArg
private final RequiredArg<RelativeDoublePosition> positionArg
private final DefaultArg<Vector3f> rotationArg
