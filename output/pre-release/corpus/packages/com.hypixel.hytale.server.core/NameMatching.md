# NameMatching

Type: enum | Package: com.hypixel.hytale.server.core

public enum NameMatching

Defines name matching strategies for finding entities/players by name. Each strategy combines a `Comparator<String>` (for scoring partial matches) and a `BiPredicate<String, String>` (for exact equality). Used by command completion and player lookup systems.

## Enum Constants

- EXACT | Exact string equality (case-sensitive).
- EXACT_IGNORE_CASE | Exact string equality (case-insensitive).
- STARTS_WITH | Prefix match (case-sensitive), scored by length difference.
- STARTS_WITH_IGNORE_CASE | Prefix match (case-insensitive), scored by length difference.

## Fields

- @Nonnull public static NameMatching DEFAULT` (= `STARTS_WITH_IGNORE_CASE`)

## Methods

- public Comparator<String> getComparator()
- @Nullable public <T> T find(@Nonnull Collection<T> players, String value, @Nonnull Function<T, String> getter)
- @Nullable public static <T> T find(@Nonnull Collection<T> players, String value, @Nonnull Function<T, String> getter, @Nonnull Comparator<String> comparator, @Nonnull BiPredicate<String, String> equality)

Also in this package: AuthMode, AuthModeConverter, Constants, Defaults, HytaleServer, HytaleServerConfig, LevelValueConverter, MaybeBoolCodec, Message, Module, Options, ParamValueCodec, PathConverter, PathType, RecoveryMode, ShutdownReason, SocketAddressValueConverter, StringToPathMapConverter, TimeoutProfile, UUIDConverter

Complete API:
  public Comparator<String> getComparator()
  public T find(Collection<T> players, String value, Function<T,String> getter)
  public static T find(Collection<T> players, String value, Function<T,String> getter, Comparator<String> comparator, BiPredicate<String,String> equality)

Fields:
public static NameMatching DEFAULT
private final Comparator<String> comparator
private final BiPredicate<String,String> equality
