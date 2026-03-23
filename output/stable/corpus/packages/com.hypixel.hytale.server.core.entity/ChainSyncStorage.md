# ChainSyncStorage

Type: interface | Package: com.hypixel.hytale.server.core.entity

public interface ChainSyncStorage

Interface for interaction chain client-server state synchronization. Defines methods for getting/setting client state, accessing interaction entries by index, putting/clearing sync data, updating sync position, checking for out-of-order data, and syncing forked chains.

Known implementors: InteractionChain, TempChain

Also in this package: AnimationUtils, CallState, ChainCancelledException, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  InteractionState getClientState()
  void setClientState(InteractionState var1)
  InteractionEntry getInteraction(int var1)
  void putInteractionSyncData(int var1, InteractionSyncData var2)
  void updateSyncPosition(int var1)
  boolean isSyncDataOutOfOrder(int var1)
  void syncFork(Ref<EntityStore> var1, InteractionManager var2, SyncInteractionChain var3)
  void clearInteractionSyncData(int var1)
