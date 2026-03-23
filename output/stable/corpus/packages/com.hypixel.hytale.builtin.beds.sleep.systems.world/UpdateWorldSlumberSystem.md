# UpdateWorldSlumberSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.world | Extends: TickingSystem<EntityStore>

public class UpdateWorldSlumberSystem extends TickingSystem<EntityStore>

ECS system handling UpdateWorldSlumber tick processing.

## Fields

- @Nonnull private final ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType
- @Nonnull private final ResourceType<EntityStore, WorldSomnolence> worldSomnolenceResourceType
- @Nonnull private final ResourceType<EntityStore, WorldTimeResource> worldTimeResourceType

## Methods

- public UpdateWorldSlumberSystem(@Nonnull ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType,
        @Nonnull ResourceType<EntityStore, WorldSomnolence> worldSomnolenceResourceType,
        @Nonnull ResourceType<EntityStore, WorldTimeResource> worldTimeResourceType)` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` |
| `@Nonnull private static` | `Instant` | `computeWakeupTime(@Nonnull WorldSlumber slumber)` |
| `private static` | `boolean` | `isSomeoneAwake(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType)` |
