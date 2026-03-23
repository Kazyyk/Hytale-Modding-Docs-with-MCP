# NPCMemory

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.memories.npc | Extends: Memory

public class NPCMemory extends Memory

## Constants

- public static final String ID
- public static final String ZONE_NAME_UNKNOWN

## Fields

- public static final String ID
- public static final String ZONE_NAME_UNKNOWN
- private String npcRole
- private long capturedTimestamp
- private String foundLocationZoneNameKey
- private String foundLocationGeneralNameKey
- private String memoryTitleKey
- private final ComponentType<EntityStore, TransformComponent> transformComponentType
- private final ComponentType<EntityStore, Player> playerComponentType
- private final ComponentType<EntityStore, PlayerRef> playerRefComponentType
- private final ComponentType<EntityStore, PlayerMemories> playerMemoriesComponentType
- private final Query<EntityStore> query
- private final double radius

## Methods

- private NPCMemory()
- public NPCMemory(@Nonnull String npcRole, @Nonnull String nameTranslationKey)
- public String getId()
- public String getTitle()
- public Message getTooltipText()
- public String getIconPath()
- public Message getUndiscoveredTooltipText()
- public String getNpcRole()
- public long getCapturedTimestamp()
- public String getFoundLocationZoneNameKey()
- public Message getLocationMessage()
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String toString()
- public void tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- private static String findLocationZoneName(@Nonnull World world, @Nonnull Vector3d position)
- private static void displayCatchEntityParticles( @Nonnull MemoriesGameplayConfig memoriesGameplayConfig, @Nonnull Vector3d targetPosition, @Nonnull Ref<EntityStore> targetRef, @Nonnull CommandBuffer<EntityStore> commandBuffer )
- public Query<EntityStore> getQuery()

Also in this package: GatherMemoriesSystem, NPCMemoryProvider

Complete API:
  public String getId()
  public String getTitle()
  public Message getTooltipText()
  public String getIconPath()
  public Message getUndiscoveredTooltipText()
  public String getNpcRole()
  public long getCapturedTimestamp()
  public String getFoundLocationZoneNameKey()
  public Message getLocationMessage()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final String ID
public static final String ZONE_NAME_UNKNOWN
public static final BuilderCodec<NPCMemory> CODEC
private String npcRole
private long capturedTimestamp
private String foundLocationZoneNameKey
private String foundLocationGeneralNameKey
private String memoryTitleKey
