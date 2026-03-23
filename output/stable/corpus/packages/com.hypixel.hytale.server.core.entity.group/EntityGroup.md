# EntityGroup

Type: class | Package: com.hypixel.hytale.server.core.entity.group | Implements: Component

public class EntityGroup implements Component

## Fields

- private final Set<Ref<EntityStore>> memberSet
- private final List<Ref<EntityStore>> memberList
- private Ref<EntityStore> leaderRef
- private boolean dissolved

## Methods

- public static ComponentType<EntityStore,EntityGroup> getComponentType()
- @Nullable public Ref<EntityStore> getLeaderRef()
- public void setLeaderRef(Ref<EntityStore> leaderRef)
- public void add(Ref<EntityStore> reference)
- public void remove(Ref<EntityStore> reference)
- @Nullable public Ref<EntityStore> getFirst()
- @Nonnull public List<Ref<EntityStore>> getMemberList()
- public int size()
- public boolean isDissolved()
- public void setDissolved(boolean dissolved)
- public void clear()
- public boolean isMember(Ref<EntityStore> reference)
- public void forEachMemberExcludingLeader(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)
- public void forEachMemberExcludingSelf(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)
- public void forEachMember(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)
- public void forEachMember(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg, Ref<EntityStore> excludeReference)
- public void forEachMemberExcludingLeader(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)
- public void forEachMemberExcludingSelf(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)
- public void forEachMember(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)
- public void forEachMember(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v, Ref<EntityStore> excludeReference)
- public void forEachMemberExcludingLeader(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)
- public void forEachMemberExcludingSelf(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)
- public void forEachMember(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)
- public void forEachMember(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value, Ref<EntityStore> excludeReference)
- public void forEachMember(IntBiObjectConsumer<Ref<EntityStore>,T> consumer, T t)
- @Nullable public Ref<EntityStore> testMembers(Predicate<Ref<EntityStore>> predicate, boolean skipLeader)
- @Nonnull @Override public Component<EntityStore> clone()
- @Nonnull @Override public String toString()

Complete API:
  public static ComponentType<EntityStore,EntityGroup> getComponentType()
  public Ref<EntityStore> getLeaderRef()
  public void setLeaderRef(Ref<EntityStore> leaderRef)
  public void add(Ref<EntityStore> reference)
  public void remove(Ref<EntityStore> reference)
  public Ref<EntityStore> getFirst()
  public List<Ref<EntityStore>> getMemberList()
  public int size()
  public boolean isDissolved()
  public void setDissolved(boolean dissolved)
  public void clear()
  public boolean isMember(Ref<EntityStore> reference)
  public void forEachMemberExcludingLeader(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)
  public void forEachMemberExcludingSelf(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)
  public void forEachMember(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)
  public void forEachMember(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg, Ref<EntityStore> excludeReference)
  public void forEachMemberExcludingLeader(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)
  public void forEachMemberExcludingSelf(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)
  public void forEachMember(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)
  public void forEachMember(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v, Ref<EntityStore> excludeReference)
  public void forEachMemberExcludingLeader(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)
  public void forEachMemberExcludingSelf(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)
  public void forEachMember(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)
  public void forEachMember(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value, Ref<EntityStore> excludeReference)
  public void forEachMember(IntBiObjectConsumer<Ref<EntityStore>,T> consumer, T t)
  public Ref<EntityStore> testMembers(Predicate<Ref<EntityStore>> predicate, boolean skipLeader)
  public Component<EntityStore> clone()
  public String toString()

Fields:
private final Set<Ref<EntityStore>> memberSet
private final List<Ref<EntityStore>> memberList
private Ref<EntityStore> leaderRef
private boolean dissolved
