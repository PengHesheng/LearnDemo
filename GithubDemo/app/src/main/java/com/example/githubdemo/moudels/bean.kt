package com.example.githubdemo.moudels

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * @author 14512 on 2019/4/16
 */

/*
{
    id: 35507603,
    node_id: "MDEwOlJlcG9zaXRvcnkzNTUwNzYwMw==",
    name: "aerosolve",
    full_name: "airbnb/aerosolve",
    private: false,
    owner: - {
        login: "airbnb",
        id: 698437,
        node_id: "MDEyOk9yZ2FuaXphdGlvbjY5ODQzNw==",
        avatar_url: "https://avatars3.githubusercontent.com/u/698437?v=4",
        gravatar_id: "",
        url: "https://api.github.com/users/airbnb",
        html_url: "https://github.com/airbnb",
        followers_url: "https://api.github.com/users/airbnb/followers",
        following_url: "https://api.github.com/users/airbnb/following{/other_user}",
        gists_url: "https://api.github.com/users/airbnb/gists{/gist_id}",
        starred_url: "https://api.github.com/users/airbnb/starred{/owner}{/repo}",
        subscriptions_url: "https://api.github.com/users/airbnb/subscriptions",
        organizations_url: "https://api.github.com/users/airbnb/orgs",
        repos_url: "https://api.github.com/users/airbnb/repos",
        events_url: "https://api.github.com/users/airbnb/events{/privacy}",
        received_events_url: "https://api.github.com/users/airbnb/received_events",
        type: "Organization",
        site_admin: false
    },
    html_url: "https://github.com/airbnb/aerosolve",
    description: "A machine learning package built for humans.",
    fork: false,
    url: "https://api.github.com/repos/airbnb/aerosolve",
    forks_url: "https://api.github.com/repos/airbnb/aerosolve/forks",
    keys_url: "https://api.github.com/repos/airbnb/aerosolve/keys{/key_id}",
    collaborators_url: "https://api.github.com/repos/airbnb/aerosolve/collaborators{/collaborator}",
    teams_url: "https://api.github.com/repos/airbnb/aerosolve/teams",
    hooks_url: "https://api.github.com/repos/airbnb/aerosolve/hooks",
    issue_events_url: "https://api.github.com/repos/airbnb/aerosolve/issues/events{/number}",
    events_url: "https://api.github.com/repos/airbnb/aerosolve/events",
    assignees_url: "https://api.github.com/repos/airbnb/aerosolve/assignees{/user}",
    branches_url: "https://api.github.com/repos/airbnb/aerosolve/branches{/branch}",
    tags_url: "https://api.github.com/repos/airbnb/aerosolve/tags",
    blobs_url: "https://api.github.com/repos/airbnb/aerosolve/git/blobs{/sha}",
    git_tags_url: "https://api.github.com/repos/airbnb/aerosolve/git/tags{/sha}",
    git_refs_url: "https://api.github.com/repos/airbnb/aerosolve/git/refs{/sha}",
    trees_url: "https://api.github.com/repos/airbnb/aerosolve/git/trees{/sha}",
    statuses_url: "https://api.github.com/repos/airbnb/aerosolve/statuses/{sha}",
    languages_url: "https://api.github.com/repos/airbnb/aerosolve/languages",
    stargazers_url: "https://api.github.com/repos/airbnb/aerosolve/stargazers",
    contributors_url: "https://api.github.com/repos/airbnb/aerosolve/contributors",
    subscribers_url: "https://api.github.com/repos/airbnb/aerosolve/subscribers",
    subscription_url: "https://api.github.com/repos/airbnb/aerosolve/subscription",
    commits_url: "https://api.github.com/repos/airbnb/aerosolve/commits{/sha}",
    git_commits_url: "https://api.github.com/repos/airbnb/aerosolve/git/commits{/sha}",
    comments_url: "https://api.github.com/repos/airbnb/aerosolve/comments{/number}",
    issue_comment_url: "https://api.github.com/repos/airbnb/aerosolve/issues/comments{/number}",
    contents_url: "https://api.github.com/repos/airbnb/aerosolve/contents/{+path}",
    compare_url: "https://api.github.com/repos/airbnb/aerosolve/compare/{base}...{head}",
    merges_url: "https://api.github.com/repos/airbnb/aerosolve/merges",
    archive_url: "https://api.github.com/repos/airbnb/aerosolve/{archive_format}{/ref}",
    downloads_url: "https://api.github.com/repos/airbnb/aerosolve/downloads",
    issues_url: "https://api.github.com/repos/airbnb/aerosolve/issues{/number}",
    pulls_url: "https://api.github.com/repos/airbnb/aerosolve/pulls{/number}",
    milestones_url: "https://api.github.com/repos/airbnb/aerosolve/milestones{/number}",
    notifications_url: "https://api.github.com/repos/airbnb/aerosolve/notifications{?since,all,participating}",
    labels_url: "https://api.github.com/repos/airbnb/aerosolve/labels{/name}",
    releases_url: "https://api.github.com/repos/airbnb/aerosolve/releases{/id}",
    deployments_url: "https://api.github.com/repos/airbnb/aerosolve/deployments",
    created_at: "2015-05-12T19:11:57Z",
    updated_at: "2019-04-14T19:24:15Z",
    pushed_at: "2018-12-03T23:12:18Z",
    git_url: "git://github.com/airbnb/aerosolve.git",
    ssh_url: "git@github.com:airbnb/aerosolve.git",
    clone_url: "https://github.com/airbnb/aerosolve.git",
    svn_url: "https://github.com/airbnb/aerosolve",
    homepage: "http://airbnb.github.io/aerosolve/",
    size: 6884,
    stargazers_count: 4537,
    watchers_count: 4537,
    language: "Scala",
    has_issues: true,
    has_projects: true,
    has_downloads: true,
    has_wiki: false,
    has_pages: true,
    forks_count: 571,
    mirror_url: null,
    archived: false,
    disabled: false,
    open_issues_count: 10,
    license: - {
        key: "apache-2.0",
        name: "Apache License 2.0",
        spdx_id: "Apache-2.0",
        url: "https://api.github.com/licenses/apache-2.0",
        node_id: "MDc6TGljZW5zZTI="
    },
    forks: 571,
    open_issues: 10,
    watchers: 4537,
    default_branch: "master"
},
 */
@Entity(tableName = "users")
data class User(@PrimaryKey var id: Int, var name: String?,
                @SerializedName("full_name") var fullName: String?,
                @SerializedName("html_url") var htmlUrl: String?,
                @SerializedName("stargazers_count") var stars: Long?,
                var forks: Long?,
                @Embedded var owner: Owner?) {

    data class Owner(var login: String?,
                     @SerializedName("avatar_url") var portrait: String?)

    override fun toString(): String {
        return "id:$id, name:$name, fullName:$fullName, stars:$stars, forks:$forks, portrait:${owner?.portrait}"
    }
}