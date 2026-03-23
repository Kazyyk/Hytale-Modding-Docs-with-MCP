# EntityChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: Component<ChunkStore>

public class EntityChunk implements Component<ChunkStore>

ECS component that stores world entities (NPCs, items, projectiles, etc.) associated with a chunk column. Similar to BlockComponentChunk but for the `EntityStore` rather than `ChunkStore`. Maintains parallel collections of `Holder<EntityStore>` (serialized entities not yet in the live store) and `Ref<EntityStore>` (live entity references).

## Static Fields

- CODEC | BuilderCodec<EntityChunk> | Codec serializing the `"Entities"` array of stored holders.

## Static Methods


@Nonnull
public static ComponentType<ChunkStore, EntityChunk> getComponentType()

## Instance Methods


@Nonnull
public List<Holder<EntityStore>> getEntityHolders()

Returns an unmodifiable view of the stored entity holders.


public void addEntityHolder(@Nonnull Holder<EntityStore> holder)

Adds a holder and marks the chunk as needing to be saved.


@Nonnull
public Set<Ref<EntityStore>> getEntityReferences()

Returns an unmodifiable view of the live entity references.


public void addEntityReference(@Nonnull Ref<EntityStore> reference)


public void removeEntityReference(@Nonnull Ref<EntityStore> reference)


@Nullable
public Holder<EntityStore>[] takeEntityHolders()

Returns and clears all entity holders. Returns `null` if empty.


@Nullable
public Ref<EntityStore>[] takeEntityReferences()

Returns and clears all entity references. Returns `null` if empty.

## Inner Classes

- `EntityChunkLoadingSystem` -- `RefChangeSystem` that converts between holders and live references during chunk ticking transitions.

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockOperations, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public static ComponentType<ChunkStore,EntityChunk> getComponentType()
  public Component<ChunkStore> clone()
  public Component<ChunkStore> cloneSerializable()
  public List<Holder<EntityStore>> getEntityHolders()
  public void addEntityHolder(Holder<EntityStore> holder)
  public void storeEntityHolder(Holder<EntityStore> holder)
  public Set<Ref<EntityStore>> getEntityReferences()
  public void addEntityReference(Ref<EntityStore> reference)
  public void loadEntityReference(Ref<EntityStore> reference)
  public void removeEntityReference(Ref<EntityStore> reference)
  public void unloadEntityReference(Ref<EntityStore> reference)
  public Holder<EntityStore>[] takeEntityHolders()
  public Ref<EntityStore>[] takeEntityReferences()
  public boolean getNeedsSaving()
  public void markNeedsSaving()
  public boolean consumeNeedsSaving()

Fields:
public static final BuilderCodec<EntityChunk> CODEC
private final List<Holder<EntityStore>> entityHolders
private final ReferenceSet<Ref<EntityStore>> entityReferences
private final List<Holder<EntityStore>> entityHoldersUnmodifiable
private final Set<Ref<EntityStore>> entityReferencesUnmodifiable
private boolean needsSaving
