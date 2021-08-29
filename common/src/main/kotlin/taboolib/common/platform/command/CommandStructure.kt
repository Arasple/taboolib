package taboolib.common.platform.command

/**
 * TabooLib
 * taboolib.common.CommandStructure
 *
 * @author sky
 * @since 2021/6/24 11:48 下午
 */
class CommandStructure(
    name: String,
    val aliases: List<String>,
    val description: String,
    val usage: String,
    val permission: String,
    val bodyPermissions: Map<String, PermissionDefault>,
    val permissionMessage: String,
    val permissionDefault: PermissionDefault
) {

    val name = name.lowercase()
}