package com.example.gestiondestock.DTO;


import com.example.gestiondestock.model.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RolesDto {
	private Integer id;
	private String roleName;
	private UtilisateurDto utilisateur;
	public static RolesDto fromEntity(Roles roles){
  if(roles==null){
	  return null;
  }
    return RolesDto.builder()
			.id(roles.getId())
			.roleName(roles.getRoleName())
	//		.utilisateur(roles.getUtilisateur())
			.build();
	}
	public static Roles toEntity(RolesDto rolesDto){
       if(rolesDto==null)
	   {
		   return null;
	   }
	   Roles role=new Roles();
	   role.setId(rolesDto.getId());
	   role.setRoleName(rolesDto.getRoleName());
	  // role.setUtilisateur(rolesDto.getUtilisateur());
		return role;
	}
}
