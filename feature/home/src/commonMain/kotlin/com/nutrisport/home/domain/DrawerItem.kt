package com.nutrisport.home.domain

import com.nutrisport.shared.Resources
import org.jetbrains.compose.resources.DrawableResource

enum class DrawerItem(
    val title: String,
    val icon: DrawableResource
) {
    Profile(
        title = "Profile",
        icon = Resources.Icon.Person
    ),
    Blog(
        title = "Blog",
        icon = Resources.Icon.Book
    ),
    Location(
        title = "Locations",
        icon = Resources.Icon.MapPin
    ),
    Contact(
        title = "Contact us",
        icon = Resources.Icon.Edit
    ),
    SignOut(
        title = "Sign out",
        icon = Resources.Icon.SignOut
    ),
    Admin(
        title = "Admin panel",
        icon = Resources.Icon.Unlock
    )
}