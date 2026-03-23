# InstanceSpawnCommand

Type: class | Package: com.hypixel.hytale.builtin.instances.command | Extends: AbstractPlayerCommand

public class InstanceSpawnCommand extends AbstractPlayerCommand

Extends `AbstractPlayerCommand`.

## Methods

- super("spawn", "server.commands.instances.spawn.desc")
- protected Vector3f getSpawnRotation(@Nonnull Ref<EntityStore> ref,
        @Nonnull CommandContext context,
        @Nonnull DefaultArg<Vector3f> rotationArg,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
